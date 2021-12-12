diff --git a/drools-compiler/src/test/java/org/drools/compiler/integrationtests/MiscTest2.java b/drools-compiler/src/test/java/org/drools/compiler/integrationtests/MiscTest2.java
index 8fe73b9..ad8a232 100644
--- a/drools-compiler/src/test/java/org/drools/compiler/integrationtests/MiscTest2.java
+++ b/drools-compiler/src/test/java/org/drools/compiler/integrationtests/MiscTest2.java
@@ -1924,7 +1924,7 @@
 
         FactType messageType2 = ksession2.getKieBase().getFactType("org.drools.test", "Message");
         Object message2 = messageType2.newInstance();
-        messageType.set(message2, "message", "Hello World");
+        messageType2.set(message2, "message", "Hello World");
 
         ksession2.insert(message2);
         assertEquals( 1, ksession2.fireAllRules() );
