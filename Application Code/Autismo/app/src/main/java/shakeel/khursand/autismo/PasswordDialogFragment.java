package shakeel.khursand.autismo;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PasswordDialogFragment extends DialogFragment {
    private View dialogView;
    private String unlockPassword;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //return super.onCreateDialog(savedInstanceState);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Set Unlock Password");
        LayoutInflater inflater = getActivity().getLayoutInflater();
        dialogView = inflater.inflate(R.layout.unlock_password, null);
        builder.setView(dialogView);

        builder.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        alertDialog.setCanceledOnTouchOutside(false);

        return alertDialog;

    }

    @Override
    public void onStart() {
        super.onStart();

        final AlertDialog dialog = (AlertDialog) getDialog();
        if (dialog != null){
            Button positiveButton = (Button) dialog.getButton(Dialog.BUTTON_POSITIVE);
            positiveButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    EditText editText = (EditText) dialogView.findViewById(R.id.editText);
                    String password = editText.getText().toString();

                    if (password.equals("")){
                        Toast.makeText(getActivity(), "Please enter a password.", Toast.LENGTH_SHORT).show();
                    }
                    else if (password.length() < 4){
                        Toast.makeText(getActivity(), "Password too short.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        unlockPassword = password;
                        dialog.dismiss();
                        Toast.makeText(getActivity(), "Password set.", Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }
    }
}

