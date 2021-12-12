diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/StreamsTest.java b/drools-compiler/src/test/java/org/drools/integrationtests/StreamsTest.java
index 0b13f33..1197b5e 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/StreamsTest.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/StreamsTest.java
@@ -82,7 +82,7 @@
 
         KnowledgeSessionConfiguration conf = new SessionConfiguration();
         ((SessionConfiguration) conf).setClockType( ClockType.PSEUDO_CLOCK );
-        StatefulKnowledgeSession session = kbase.newStatefulSession( conf );
+        StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession( conf );
 
         final List results = new ArrayList();
 
