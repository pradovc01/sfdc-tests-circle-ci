package org.fundacionjala.sfdc.pages.base;

import org.fundacionjala.sfdc.core.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Abstract class that gets common info in Form Page.
 */
public abstract class FormBase extends BasePage {

    @FindBy(css = ".modal-footer button[title='Save']")
    protected WebElement saveButton;

    @FindBy(css = ".modal-footer button[title='Save & New']")
    protected WebElement saveAndNewButton;

    @FindBy(css = ".modal-footer button[title='Cancel']")
    protected WebElement cancelButton;

    /**
     * Clicks the Save Button of the Form.
     */
    public void clickSaveButton() {
        CommonActions.clickElement(saveButton);
    }

    /**
     * Clicks the Save and New Button of the Form.
     */
    public void clickSaveAndNewButton() {
        CommonActions.clickElement(saveAndNewButton);
    }

    /**
     * Clicks the Cancel Button of the Form.
     */
    public void clickCancelButton() {
        CommonActions.clickElement(cancelButton);
    }
}