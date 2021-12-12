diff --git a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/DailyTimeIntervalTriggerImplSerializationTest.java b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/DailyTimeIntervalTriggerImplSerializationTest.java
index 1f95d1f..ce963db 100644
--- a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/DailyTimeIntervalTriggerImplSerializationTest.java
+++ b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/DailyTimeIntervalTriggerImplSerializationTest.java
@@ -71,7 +71,7 @@
     dti.setMisfireInstruction(MISFIRE_INSTRUCTION_SMART_POLICY);
     dti.setPriority(5);
     
-    validateSerializedForm(dti, COMPARATOR, expand("serializedforms/DailyTimeIntervalTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(dti, COMPARATOR, expand("serializedforms/DailyTimeIntervalTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
@@ -85,6 +85,6 @@
 
     dti.triggered(null);
     
-    validateSerializedForm(dti, COMPARATOR, expand("serializedforms/DailyTimeIntervalTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17_1", "JDK17_2"));
+    validateSerializedForm(dti, COMPARATOR, expand("serializedforms/DailyTimeIntervalTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17_1", "JDK17_2", "JDK18"));
   }
 }
