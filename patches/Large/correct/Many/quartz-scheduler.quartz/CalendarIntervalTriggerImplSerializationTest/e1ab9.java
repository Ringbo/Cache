diff --git a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CalendarIntervalTriggerImplSerializationTest.java b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CalendarIntervalTriggerImplSerializationTest.java
index cf4a559..8c42ce1 100644
--- a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CalendarIntervalTriggerImplSerializationTest.java
+++ b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/CalendarIntervalTriggerImplSerializationTest.java
@@ -79,7 +79,7 @@
     cti.setMisfireInstruction(MISFIRE_INSTRUCTION_SMART_POLICY);
     cti.setPriority(5);
     
-    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CalendarIntervalTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CalendarIntervalTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
@@ -96,7 +96,7 @@
 
     cti.triggered(null);
     
-    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CalendarIntervalTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(cti, COMPARATOR, expand("serializedforms/CalendarIntervalTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17", "JDK18"));
     
   }
 }
