diff --git a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/SimpleTriggerImplSerializationTest.java b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/SimpleTriggerImplSerializationTest.java
index 91f3d43..716d62e 100644
--- a/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/SimpleTriggerImplSerializationTest.java
+++ b/quartz/src/test/java/org/terracotta/quartz/upgradability/serialization/SimpleTriggerImplSerializationTest.java
@@ -65,7 +65,7 @@
     sti.setMisfireInstruction(MISFIRE_INSTRUCTION_SMART_POLICY);
     sti.setPriority(5);
     
-    validateSerializedForm(sti, COMPARATOR, expand("serializedforms/SimpleTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(sti, COMPARATOR, expand("serializedforms/SimpleTriggerImplSerializationTest.testConstructed.{?}.ser", "JDK16", "JDK17", "JDK18"));
   }
   
   @Test
@@ -79,7 +79,7 @@
 
     sti.triggered(null);
     
-    validateSerializedForm(sti, COMPARATOR, expand("serializedforms/SimpleTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17"));
+    validateSerializedForm(sti, COMPARATOR, expand("serializedforms/SimpleTriggerImplSerializationTest.testFired.{?}.ser", "JDK16", "JDK17", "JDK18"));
     
   }
 }
