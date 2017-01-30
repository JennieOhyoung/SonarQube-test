
package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    System.out.println("featureUnitTest1");
    System.out.println("featureUnitTest2");
  }

  public void coveredByIntegrationTest() {
    System.out.println("featureIntegrationTest1");
    System.out.println("featureIntegrationTest2");
    System.out.println("featureIntegrationTest3");
  }

  public void notCovered() {
    System.out.println("DOOMED");
  }

}
