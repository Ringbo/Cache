diff --git a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CronTriggerImplSerializationTest.java b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CronTriggerImplSerializationTest.java
index 756246b..d189f28 100644
--- a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CronTriggerImplSerializationTest.java
+++ b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CronTriggerImplSerializationTest.java
@@ -79,7 +79,7 @@
     cti.setMisfireInstruction(MISFIRE_INSTRUCTION_SMART_POLICY);
     cti.setPriority(5);
     
-    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CronTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CronTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
@@ -93,7 +93,7 @@
 
     cti.triggered(null);
     
-    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CronTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CronTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17", "JDK18"));
     
   }
   
