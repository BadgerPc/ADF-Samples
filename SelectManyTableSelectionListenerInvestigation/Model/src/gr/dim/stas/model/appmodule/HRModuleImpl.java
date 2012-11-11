package gr.dim.stas.model.appmodule;

import gr.dim.stas.model.appmodule.common.HRModule;
import gr.dim.stas.model.views.CountriesViewImpl;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 12 18:20:13 CEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HRModuleImpl extends ApplicationModuleImpl implements HRModule {
    /**
     * This is the default constructor (do not remove).
     */
    public HRModuleImpl() {
    }

    /**
     * Container's getter for CountriesView1.
     * @return CountriesView1
     */
    public CountriesViewImpl getCountriesView1() {
        return (CountriesViewImpl)findViewObject("CountriesView1");
    }
    public void whatIsTheCurrentRow(){
        //get the View Object
        Row currentRow = getCountriesView1().getCurrentRow();
        // strange.. we are having only one row..
        System.out.println("current Row... "+currentRow);
    }
}