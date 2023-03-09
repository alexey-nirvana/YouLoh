package com.example.youloh;

import android.content.DialogInterface;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.viewmodel.CreationExtras;

import org.jetbrains.annotations.NotNull;

public class MyDialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener{


    @Override
    public void onCancel(DialogInterface dialogInterface) {

    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {

    }

    @NonNull
    @Override
    public CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public void show(@NotNull FragmentManager manager, @NotNull String s) {

    }
}
