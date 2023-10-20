package use_case.clear_users;

// TODO Complete me
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearPresenter){
        this.clearPresenter = clearPresenter;
        this.userDataAccessObject = userDataAccessObject;
    }

    public void execute(){
        userDataAccessObject.clear();
    }
}
