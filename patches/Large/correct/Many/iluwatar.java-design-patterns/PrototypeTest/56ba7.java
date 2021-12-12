diff --git a/prototype/src/test/java/com/iluwatar/prototype/PrototypeTest.java b/prototype/src/test/java/com/iluwatar/prototype/PrototypeTest.java
index add5617..839f27b 100644
--- a/prototype/src/test/java/com/iluwatar/prototype/PrototypeTest.java
+++ b/prototype/src/test/java/com/iluwatar/prototype/PrototypeTest.java
@@ -56,7 +56,7 @@
   /**
    * The tested prototype instance
    */
-  private final Prototype testedPrototype;
+  private final P testedPrototype;
 
   /**
    * The expected {@link Prototype#toString()} value
@@ -69,7 +69,7 @@
    * @param testedPrototype  The tested prototype instance
    * @param expectedToString The expected {@link Prototype#toString()} value
    */
-  public PrototypeTest(final Prototype testedPrototype, final String expectedToString) {
+  public PrototypeTest(final P testedPrototype, final String expectedToString) {
     this.expectedToString = expectedToString;
     this.testedPrototype = testedPrototype;
   }
