diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/TimerAndCalendarTest.java b/drools-compiler/src/test/java/org/drools/integrationtests/TimerAndCalendarTest.java
index 3a2a38e..bb783a0 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/TimerAndCalendarTest.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/TimerAndCalendarTest.java
@@ -954,7 +954,7 @@
         RuleBase ruleBase = getRuleBase();
         ruleBase.addPackage( pkg );
         ruleBase = SerializationHelper.serializeObject( ruleBase );
-        final WorkingMemory workingMemory = ruleBase.newStatefulSession();
+        final StatefulSession workingMemory = ruleBase.newStatefulSession();
 
         new Thread( new Runnable(){
             public void run(){ workingMemory.fireUntilHalt(); }
