diff --git a/src/main/java/org/testng/Assert.java b/src/main/java/org/testng/Assert.java
index 200df1d..786c3d8 100644
--- a/src/main/java/org/testng/Assert.java
+++ b/src/main/java/org/testng/Assert.java
@@ -32,7 +32,7 @@
    * @param condition the condition to evaluate 
    * @param message the assertion error message 
    */
-  static public void assertTrue(boolean condition, CharSequence message) {
+  static public void assertTrue(boolean condition, String message) {
     if(!condition) {
       failNotEquals( Boolean.valueOf(condition), Boolean.TRUE, message);
     }
@@ -53,7 +53,7 @@
    * @param condition the condition to evaluate 
    * @param message the assertion error message 
    */
-  static public void assertFalse(boolean condition, CharSequence message) {
+  static public void assertFalse(boolean condition, String message) {
     if(condition) {
       failNotEquals( Boolean.valueOf(condition), Boolean.FALSE, message); // TESTNG-81
     }
@@ -74,7 +74,7 @@
    * @param message the assertion error message
    * @param realCause the original exception
    */
-  static public void fail(CharSequence message, Throwable realCause) {
+  static public void fail(String message, Throwable realCause) {
     AssertionError ae = new AssertionError(message);
     ae.initCause(realCause);
     
@@ -85,7 +85,7 @@
    * Fails a test with the given message.
    * @param message the assertion error message 
    */
-  static public void fail(CharSequence message) {
+  static public void fail(String message) {
     throw new AssertionError(message);
   }
   
@@ -103,7 +103,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(Object actual, Object expected, CharSequence message) {
+  static public void assertEquals(Object actual, Object expected, String message) {
     if((expected == null) && (actual == null)) {
       return;
     }
@@ -125,7 +125,7 @@
    * @param expected the expected value (should be an non-null array value)
    * @param message the assertion error message
    */
-  private static void assertArrayEquals(Object actual, Object expected, CharSequence message) {
+  private static void assertArrayEquals(Object actual, Object expected, String message) {
     //is called only when expected is an array
     if (actual.getClass().isArray()) {
       int expectedLength = Array.getLength(expected);
@@ -167,7 +167,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(String actual, String expected, CharSequence message) {
+  static public void assertEquals(String actual, String expected, String message) {
     assertEquals((Object) actual, (Object) expected, message);
   }
   
@@ -190,7 +190,7 @@
    * @param delta the absolute tolerate value value between the actual and expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(double actual, double expected, double delta, CharSequence message) {
+  static public void assertEquals(double actual, double expected, double delta, String message) {
     // handle infinity specially since subtracting to infinite values gives NaN and the
     // the following test fails
     if(Double.isInfinite(expected)) {
@@ -224,7 +224,7 @@
    * @param delta the absolute tolerate value value between the actual and expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(float actual, float expected, float delta, CharSequence message) {
+  static public void assertEquals(float actual, float expected, float delta, String message) {
     // handle infinity specially since subtracting to infinite values gives NaN and the
     // the following test fails
     if(Float.isInfinite(expected)) {
@@ -256,7 +256,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(long actual, long expected, CharSequence message) {
+  static public void assertEquals(long actual, long expected, String message) {
     assertEquals(new Long(actual), new Long(expected), message);
   }
   
@@ -277,7 +277,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(boolean actual, boolean expected, CharSequence message) {
+  static public void assertEquals(boolean actual, boolean expected, String message) {
     assertEquals( Boolean.valueOf(actual), Boolean.valueOf(expected), message);
   }
   
@@ -298,7 +298,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(byte actual, byte expected, CharSequence message) {
+  static public void assertEquals(byte actual, byte expected, String message) {
     assertEquals(new Byte(actual), new Byte(expected), message);
   }
   
@@ -319,7 +319,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(char actual, char expected, CharSequence message) {
+  static public void assertEquals(char actual, char expected, String message) {
     assertEquals(new Character(actual), new Character(expected), message);
   }
   
@@ -340,7 +340,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(short actual, short expected, CharSequence message) {
+  static public void assertEquals(short actual, short expected, String message) {
     assertEquals(new Short(actual), new Short(expected), message);
   }
   
@@ -361,7 +361,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertEquals(int actual,  int expected, CharSequence message) {
+  static public void assertEquals(int actual,  int expected, String message) {
     assertEquals(new Integer(actual), new Integer(expected), message);
   }
   
@@ -390,7 +390,7 @@
    * @param object the assertion object
    * @param message the assertion error message 
    */
-  static public void assertNotNull(Object object, CharSequence message) {
+  static public void assertNotNull(Object object, String message) {
     assertTrue(object != null, message);
   }
   
@@ -409,7 +409,7 @@
    * @param object the assertion object 
    * @param message the assertion error message 
    */
-  static public void assertNull(Object object, CharSequence message) {
+  static public void assertNull(Object object, String message) {
     assertTrue(object == null, message);
   }
   
@@ -420,7 +420,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertSame(Object actual, Object expected, CharSequence message) {
+  static public void assertSame(Object actual, Object expected, String message) {
     if(expected == actual) {
       return;
     }
@@ -444,7 +444,7 @@
    * @param expected the expected value 
    * @param message the assertion error message 
    */
-  static public void assertNotSame(Object actual, Object expected, CharSequence message) {
+  static public void assertNotSame(Object actual, Object expected, String message) {
     if(expected == actual) {
       failSame(actual, expected, message);
     }
@@ -460,7 +460,7 @@
     assertNotSame(actual, expected, null);
   }
   
-  static private void failSame(Object actual, Object expected, CharSequence message) {
+  static private void failSame(Object actual, Object expected, String message) {
     String formatted = "";
     if(message != null) {
       formatted = message + " ";
@@ -468,7 +468,7 @@
     fail(formatted + "expected not same with:<" + expected +"> but was same:<" + actual + ">");
   }
   
-  static private void failNotSame(Object actual, Object expected, CharSequence message) {
+  static private void failNotSame(Object actual, Object expected, String message) {
     String formatted = "";
     if(message != null) {
       formatted = message + " ";
@@ -476,11 +476,11 @@
     fail(formatted + "expected same with:<" + expected + "> but was:<" + actual + ">");
   }
   
-  static private void failNotEquals(Object actual , Object expected, CharSequence message ) {
+  static private void failNotEquals(Object actual , Object expected, String message ) {
     fail(format(actual, expected, message));
   }
   
-  static String format(Object actual, Object expected, CharSequence message) {
+  static String format(Object actual, Object expected, String message) {
     String formatted = "";
     if (null != message) {
       formatted = message + " ";
@@ -507,7 +507,7 @@
    * @param expected the expected value
    * @param message the assertion error message
    */
-  static public void assertEquals(Collection actual, Collection expected, CharSequence message) {
+  static public void assertEquals(Collection actual, Collection expected, String message) {
     if(actual == expected) return;
     
     if ((actual == null && expected != null) || (actual != null && expected == null)) {
@@ -539,7 +539,7 @@
    * @param expected the expected value
    * @param message the assertion error message
    */
-  static public void assertEquals(Object[] actual, Object[] expected, CharSequence message) {
+  static public void assertEquals(Object[] actual, Object[] expected, String message) {
     if(actual == expected) return;
     
     if ((actual == null && expected != null) || (actual != null && expected == null)) {
@@ -556,7 +556,7 @@
    * @param expected the expected value
    * @param message the assertion error message
    */
-  static public void assertEqualsNoOrder(Object[] actual, Object[] expected, CharSequence message) {
+  static public void assertEqualsNoOrder(Object[] actual, Object[] expected, String message) {
     if(actual == expected) return;
     
     if ((actual == null && expected != null) || (actual != null && expected == null)) {
@@ -586,7 +586,7 @@
   }
   
   private static void failAssertNoEqual(Object[] actual, Object[] expected,
-		  CharSequence message, CharSequence defaultMessage)
+		  String message, String defaultMessage)
   {
     if (message != null) fail(message);
     else fail(defaultMessage);
@@ -632,7 +632,7 @@
    * @param expected the expected value
    * @param message the assertion error message
    */
-  static public void assertEquals(final byte[] actual, final byte[] expected, final CharSequence message) {
+  static public void assertEquals(final byte[] actual, final byte[] expected, final String message) {
     if(expected == actual) {
       return;
     }
