diff --git a/drools-persistence-jpa/src/main/java/org/drools/persistence/PersistableRunner.java b/drools-persistence-jpa/src/main/java/org/drools/persistence/PersistableRunner.java
index a339490..564a353 100644
--- a/drools-persistence-jpa/src/main/java/org/drools/persistence/PersistableRunner.java
+++ b/drools-persistence-jpa/src/main/java/org/drools/persistence/PersistableRunner.java
@@ -137,7 +137,7 @@
 
         ((InternalKnowledgeRuntime) this.ksession).setEndOperationListener( new EndOperationListenerImpl(this.txm, this.sessionInfo ) );
 
-        this.sessionContext = RequestContext.create().with( this.ksession );
+        this.sessionContext = RequestContext.create(ksession.getClass().getClassLoader()).with(this.ksession);
 
         this.runner = new TransactionInterceptor();
 
@@ -248,7 +248,7 @@
 
         if ( this.sessionContext == null ) {
             // this should only happen when this class is first constructed
-            this.sessionContext = RequestContext.create().with( this.ksession );
+            this.sessionContext = RequestContext.create(ksession.getClass().getClassLoader()).with( this.ksession );
         }
 
         this.runner = new TransactionInterceptor();
@@ -367,7 +367,7 @@
     }
 
     public RequestContext createContext() {
-        return RequestContext.create().with( this.ksession );
+        return RequestContext.create(ksession.getClass().getClassLoader()).with( this.ksession );
     }
 
     public ChainableRunner getChainableRunner() {
