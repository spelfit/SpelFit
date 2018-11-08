package edu.spelman.spelfitscmail.spelfit.helper;

import android.content.Context;
import android.util.Patterns;

public class InputValidation {

    private Context context;

    public InputValidation(Context context) {
        this.context = context;
    }

    public boolean isinputEditTextFilled(TextInputEditText textInputEditText, TextInputLayout textInputLayout, String message) {

        String value = textInputEditText.getText().toString().trim();
        if (value.isEmpty()) {
            textInputLayout.setError(message);
            hideKeyboardFrom(textInputEditText);
            return false;
        } else{
            textInputLayout.setErrorEnabled(false);
        }
        return true;
    }

    public boolean isInputEditTextEmail(TextInputEditText textInputEditText, TextInputLayout textInputLayout, String message){
        String value = textInputEditText.getText().toString().trim();
        if (value.isEmpty() || Patterns.EMAIL_ADDRESS.matcher(value.matches())){
            textInputLayout.setError(message);
            hideKeyboardFrom(textInputEditText);
            return false;
        } else{
            textInputLayout.setErrorEnabled(false);
        }
        return true;
    }
}
