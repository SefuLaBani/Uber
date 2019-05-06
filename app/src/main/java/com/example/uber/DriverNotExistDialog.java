package com.example.uber;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.Button;

public class DriverNotExistDialog extends AppCompatDialogFragment {
    private Button button;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setMessage("No working drivers found. Please try again later!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }

    public void openDialog() {
        DriverNotExistDialog driverNotExistDialog = new DriverNotExistDialog();
        driverNotExistDialog.show(getFragmentManager(), "Dialog");
    }
}
