# softTestAssignment2

## 1. Reflections

### 1.1 **Computer mouse**
Taken from [artoftesting](artoftesting.com)

1. Check if the mouse is an optical mouse or not.
2. Verify that left-click and right-click buttons are working fine.
3. Check if the double click is working fine.
4. Verify the time duration between two left clicks, in order to consider it as a double click.
5. Check if the scroller is present at the top or not.
6. Verify the speed of the mouse pointer.
7. Check the pressure required for clicking the mouse buttons.
8. Verify the acceleration of the mouse pointer.
9. Verify that clicking the button and dragging the mouse operation is working fine(drag and drop functionality).
10. Check the dimension of the mouse, if it’s suitable to grip and work.
11. Verify that the mouse works in all the allowed surfaces.
12. Check if the mouse is a wireless mouse or corded mouse.
13. In the case of wireless mouse, check the range up to which the mouse remains operational.
14. In the case of a wireless mouse, check the battery requirement of the mouse.
15. Check if there is an option to switch on or mouse.

### 1.2 **Catastrophic failure**

Catastrophic failure

Story found from medium.com

The Millennium bug or Y2K refers to events related to the storage and formatting of calendar data beginning in the year 2000. Problems were predicted because many programs represented four-digit years with only the final two digits, making the year 2000 indistinguishable from 1900.

It affected, for example, banks that calculate interest rates daily, centers such as nuclear power plants, hospitals, transportation, and a lot of things. Billions of dollars were spent around the world to upgrade computer systems and correct this error.


## 2. Two Katas

### 2.1 String Utility & 2.2 Bowling game kata

Created using BDD principles

Code to run the Tests for [StringUtils](https://github.com/josefmarcc/softTestAssignment2/blob/main/src/test/java/Utils/RunCucumberTest.java)

Code to run the Tests for [Bowling Game](https://github.com/josefmarcc/softTestAssignment2/blob/main/src/test/java/Game/RunCucumberTest.java)


## 3. Investigation of tools
### Junit 5

@tag is a repeatable annotation that is used to declare a tag for the annotated test class or test method.
Tags are used to filter which tests are executed for a given test plan. For example, a development team may tag tests with values such as "fast", "slow", "ci-server", etc. and then supply a list of tags to be used for the current test plan, potentially dependent on the current environment.

@disabled is applied over test class, all test methods within that class are automatically disabled as well.

@RepeatedTest is used to signal that the annotated method is a test template method that should be repeated a specified number of times with a configurable display name.

@BeforeEach is used to signal that the annotated method should be executed before each @Test method in the current test class. 

@AfterEach is used to signal that the annotated method should be executed after each @Test method in the current test class.

@BeforeAll is used to signal that the annotated method should be executed before all tests in the current test class.
In contrast to @BeforeEach methods, @BeforeAll methods are only executed once for a given test class.

@AfterAll is used to signal that the annotated method should be executed after all tests in the current test class.
In contrast to @AfterEach methods, @AfterAll methods are only executed once for a given test class. 

@DisplayName is used to declare a custom display name for the annotated test class or test method.
Display names are typically used for test reporting in IDEs and build tools and may contain spaces, special characters, and even emoji.

@Nested is used to signal that the annotated class is a nested, non-static test class.

assumeFalse, assumeTrue used to determine if a test should run given the conditions applied

### 3.2 Mocking Frameworks

Mockito jmockit

<em>What are their similarities?</em>

Both easy to setup and both use @Mock annotation and other annotations to help define mocks with runners. 

<em>What are their differences?</em>

Static method/constructor can be mocked directly in JMockit.

Mockito has a larger community 

<em>Which one would you prefer, if any, and why?</em>

Mockito as the community is larger and therefor there is more documentation
