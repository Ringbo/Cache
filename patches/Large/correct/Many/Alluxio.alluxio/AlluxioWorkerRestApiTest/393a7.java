diff --git a/tests/src/test/java/alluxio/worker/AlluxioWorkerRestApiTest.java b/tests/src/test/java/alluxio/worker/AlluxioWorkerRestApiTest.java
index cfee55a..797e2aa 100644
--- a/tests/src/test/java/alluxio/worker/AlluxioWorkerRestApiTest.java
+++ b/tests/src/test/java/alluxio/worker/AlluxioWorkerRestApiTest.java
@@ -51,8 +51,8 @@
  * Test cases for {@link AlluxioWorkerRestServiceHandler}.
  */
 @RunWith(PowerMockRunner.class)
-@PrepareForTest({AlluxioWorker.class, BlockWorker.class, BlockStoreMeta.class, Configuration.class,
-    WorkerContext.class})
+@PrepareForTest({DefaultAlluxioWorker.class, BlockWorker.class, BlockStoreMeta.class,
+    Configuration.class, WorkerContext.class})
 public final class AlluxioWorkerRestApiTest extends RestApiTest {
   private static final String ALLUXIO_CONF_PREFIX = "alluxio";
   private static final String NOT_ALLUXIO_CONF_PREFIX = "_alluxio_";
@@ -63,7 +63,7 @@
   @Before
   public void before() {
     mWorker = PowerMockito.spy(mResource.get().getWorker());
-    Whitebox.setInternalState(AlluxioWorker.class, "sAlluxioWorker", mWorker);
+    Whitebox.setInternalState(DefaultAlluxioWorker.class, "sAlluxioWorker", mWorker);
     BlockWorker blockWorker = PowerMockito.mock(BlockWorker.class);
     Whitebox.setInternalState(mWorker, "mBlockWorker", blockWorker);
     mStoreMeta = PowerMockito.mock(BlockStoreMeta.class);
