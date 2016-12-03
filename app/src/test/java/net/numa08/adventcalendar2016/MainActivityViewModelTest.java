package net.numa08.adventcalendar2016;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainActivityViewModelTest {

    @Test
    public void message_change_on_click() {
        final MainActivityViewModel viewModel = new MainActivityViewModel();
        assertThat(viewModel.getMessage(), is("not clicked"));
        viewModel.onClickButton(null);
        assertThat(viewModel.getMessage(), is("clicked"));
    }

}