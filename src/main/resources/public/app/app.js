angular.module("pm", ["ngResource", "ngRoute", "ngCookies"]);
angular.module("pm")
        .controller("homeCtrl", function ($scope, dataService) {
            $scope.user = {};
            $scope.save = function () {
                dataService.saveUser($scope.user)
                        .then(function (response) {
                            if (response.data.status) {
                                $scope.successMsg = "user created successfully";
                            } else {
                                $scope.successMsg = response.data.errorMessage;
                            }

                        });
            }
            $scope.login = function () {
                dataService.login($scope.user.username, $scope.user.password).then(function (data) {
                    if (data.success) {
                        $scope.successMsg = "user " + $scope.user.username + " is logged on!"
                    } else {
                        $scope.successMsg = "no such user!"
                    }
                })


            }
        });
angular.module("pm")
        .service("dataService", function ($q, $resource, $http, $httpParamSerializer, $cookies) {
            $service = this;
            $service.saveUser = function (user) {
                $http.defaults.headers.common.Authorization =
                        'Bearer ' + $cookies.get('access_token');
                var req = {
                    method: 'POST',
                    url: "/users",
                    headers: {
                        "Content-type": "application/json"
                    },
                    data: {
                        username: user.username,
                        password: user.password
                    }
                }
                return $http(req);
            }
            $service.login = function (username, password) {
                var deferred = $q.defer();
                var encodedCeredentials = btoa("my-trusted-client:secret");
                var data = {
                    grant_type: "password",
                    username: username,
                    password: password,
                    client_id: "my-trusted-client"
                };
                var req = {
                    method: 'POST',
                    url: "/oauth/token",
                    headers: {
                        "Authorization": "Basic " + encodedCeredentials,
                        "Content-type": "application/x-www-form-urlencoded; charset=utf-8"
                    },
                    data: $httpParamSerializer(data)
                }
                $http(req).then(function (data) {
                    $http.defaults.headers.common.Authorization =
                            'Bearer ' + data.data.access_token;
                    if (data.data.access_token.length > 0) {
                        deferred.resolve({
                            success: true
                        })
                    }
                    $cookies.put("access_token", data.data.access_token);
                    console.log(data.data.access_token);
                });
                return deferred.promise;
            }
        });

