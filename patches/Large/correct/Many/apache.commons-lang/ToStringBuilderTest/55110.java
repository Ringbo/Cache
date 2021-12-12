diff --git a/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java b/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java
index 8e32287..f0c5af7 100644
--- a/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java
+++ b/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java
@@ -316,7 +316,7 @@
         // representation different for IBM JDK 1.6.0, LANG-727
         assumeFalse("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION));
         assumeFalse("Oracle Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".compareTo(SystemUtils.JAVA_SPECIFICATION_VERSION) < 0);
-        final List<Object> list = new ArrayList<>();
+        final List<Object> list = new ArrayList<>(10);
         final String baseString = this.toBaseString(list);
         final String expectedWithTransients = baseString + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
         final String toStringWithTransients = ToStringBuilder.reflectionToString(list, null, true);
