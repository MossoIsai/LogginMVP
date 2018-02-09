package com.mosso.logginmvp.view.activities;

/**
 * Created by isaigarciamoso on 09/02/18.
 */

public interface LoginInterface {

    interface  View{
      void initViews();
    }
    interface Presentador{
        void login(String usuario, String password);
    }
    interface Interaptor{
        void login(String usuario, String password);

    }


}
