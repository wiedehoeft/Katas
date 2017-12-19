package katas.bowlinggame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ApplicationControllerTest {

  private Application application;

  @Mock
  private DialogController dialogController;

  @Mock
  private IOController ioController;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    application = new Application(dialogController, ioController);
  }

  @Test
  public void testThatUserHasToEnterNameAfterApplicationStarts() throws Exception {

    // When
    application.start();

    // Then
    Mockito.verify(dialogController).printGreetingAndGetUserName();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testThatUserHasToChooseAnOptionAfterMenuShows() throws Exception {
    // Given
    Mockito.when(ioController.getUserInput()).thenReturn(" ");

    //When
    application.showOptionMenu();

    //Then => Throws exception
  }

  @Test
  public void testUserChoosesValidOption() throws Exception {
    // Given
    Mockito.when(ioController.getUserInput()).thenReturn("1");

    //When
    application.showOptionMenu();

    //Then
    Mockito.verify(dialogController).showOptionMenu();
    Mockito.verify(dialogController).startGame();
  }
}
