/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.util;

/**
 *
 * @author Amine Jendoubi
 */
public class StatusMessage {

    private boolean status;
    private String errorMessage;

    public StatusMessage(boolean status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public StatusMessage(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
