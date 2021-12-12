diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/query/VisorRunningQueriesCollectorTaskArg.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/query/VisorRunningQueriesCollectorTaskArg.java
index c851559..2de61c5 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/query/VisorRunningQueriesCollectorTaskArg.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/query/VisorRunningQueriesCollectorTaskArg.java
@@ -31,7 +31,7 @@
     private static final long serialVersionUID = 0L;
 
     /** Duration to check. */
-    private Long duration;
+    private long duration;
 
     /**
      * Default constructor.
@@ -43,25 +43,25 @@
     /**
      * @param duration Duration to check.
      */
-    public VisorRunningQueriesCollectorTaskArg(Long duration) {
+    public VisorRunningQueriesCollectorTaskArg(long duration) {
         this.duration = duration;
     }
 
     /**
      * @return Duration to check.
      */
-    public Long getDuration() {
+    public long getDuration() {
         return duration;
     }
 
     /** {@inheritDoc} */
     @Override protected void writeExternalData(ObjectOutput out) throws IOException {
-        out.writeObject(duration);
+        out.writeLong(duration);
     }
 
     /** {@inheritDoc} */
     @Override protected void readExternalData(byte protoVer, ObjectInput in) throws IOException, ClassNotFoundException {
-        duration = (Long)in.readObject();
+        duration = in.readLong();
     }
 
     /** {@inheritDoc} */
