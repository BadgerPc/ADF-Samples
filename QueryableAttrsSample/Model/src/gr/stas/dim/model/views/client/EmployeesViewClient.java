package gr.stas.dim.model.views.client;

import gr.stas.dim.model.views.common.EmployeesView;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 30 15:02:21 EEST 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesViewClient extends ViewUsageImpl implements EmployeesView {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesViewClient() {
    }

    public void changeQueryableProperty(String attrName, Boolean isQueryable) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"changeQueryableProperty",new String [] {"java.lang.String","java.lang.Boolean"},new Object[] {attrName, isQueryable});
        return;
    }
}
