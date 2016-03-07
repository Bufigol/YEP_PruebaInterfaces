package com.bufigol.yep;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Caso de prueba donde se presiona el boton de login
 * Created by bufigol on 7/03/16.
 */
public class CasoPrueba extends ActivityInstrumentationTestCase2<LoginActivity> {
    private Button loginBtn;
    private LoginActivity actividad;
    public CasoPrueba() {
        super(LoginActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        loginBtn = (Button) actividad.findViewById(R.id.login);

    }
    public void test2() {
        TouchUtils.clickView(this, loginBtn);
    }
}
