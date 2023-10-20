package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {

    private final SignupViewModel signupViewModel;
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, SignupViewModel signupViewModel,
                          ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
        this.signupViewModel = signupViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public void prepareSuccessView(){
        //On successful clear, present a users cleared screen
        //After return to signup screen
        clearViewModel.firePropertyChanged();
        return;
    }
}
