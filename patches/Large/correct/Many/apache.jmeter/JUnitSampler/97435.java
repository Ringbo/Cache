diff --git a/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java b/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
index a8ffb62..319dc6d 100644
--- a/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
+++ b/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
@@ -335,7 +335,7 @@
 
                 if (!getDoNotSetUpTearDown() && SETUP_METHOD != null){
                     try {
-                        SETUP_METHOD.invoke(this.TEST_INSTANCE,new Class[0]);
+                        SETUP_METHOD.invoke(this.TEST_INSTANCE,new Object[0]);
                     } catch (InvocationTargetException e) {
                         tr.addFailure(this.TEST_INSTANCE,
                                 new AssertionFailedError(e.getMessage()));
@@ -357,7 +357,7 @@
                 // will include setup and teardown.
                 Protectable p = new Protectable() {
                     public void protect() throws Throwable {
-                        m.invoke(theClazz,new Class[0]);
+                        m.invoke(theClazz,new Object[0]);
                     }
                 };
                 tr.runProtected(theClazz, p);
@@ -365,7 +365,7 @@
                 sresult.sampleEnd();
 
                 if (!getDoNotSetUpTearDown() && TDOWN_METHOD != null){
-                    TDOWN_METHOD.invoke(TEST_INSTANCE,new Class[0]);
+                    TDOWN_METHOD.invoke(TEST_INSTANCE,new Object[0]);
                 }
             } catch (InvocationTargetException e) {
                 // log.warn(e.getMessage());
