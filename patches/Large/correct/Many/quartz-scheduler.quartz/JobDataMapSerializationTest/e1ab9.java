diff --git a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/JobDataMapSerializationTest.java b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/JobDataMapSerializationTest.java
index 2d60602..8826101 100644
--- a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/JobDataMapSerializationTest.java
+++ b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/JobDataMapSerializationTest.java
@@ -33,14 +33,14 @@
   @Test
   public void testEmptyMap() throws IOException, ClassNotFoundException {
     JobDataMap jdm = new JobDataMap();
-    validateSerializedForm(jdm, COMPARATOR, expand("serializedforms/JobDataMapSerializationTest.testEmptyMap.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(jdm, COMPARATOR, expand("serializedforms/JobDataMapSerializationTest.testEmptyMap.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
   public void testEmptyAllowTransientsMap() throws IOException, ClassNotFoundException {
     JobDataMap jdm = new JobDataMap();
     jdm.setAllowsTransientData(true);
-    validateSerializedForm(jdm, COMPARATOR, expand("serializedforms/JobDataMapSerializationTest.testEmptyAllowTransientsMap.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(jdm, COMPARATOR, expand("serializedforms/JobDataMapSerializationTest.testEmptyAllowTransientsMap.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
