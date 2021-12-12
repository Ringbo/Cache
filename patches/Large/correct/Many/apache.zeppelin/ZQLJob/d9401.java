diff --git a/zeppelin-server/src/main/java/com/nflabs/zeppelin/server/ZQLJob.java b/zeppelin-server/src/main/java/com/nflabs/zeppelin/server/ZQLJob.java
index f3dd775..f8f4f07 100644
--- a/zeppelin-server/src/main/java/com/nflabs/zeppelin/server/ZQLJob.java
+++ b/zeppelin-server/src/main/java/com/nflabs/zeppelin/server/ZQLJob.java
@@ -133,9 +133,10 @@
 	 * ZQLJob run does:
 	 *   - compile ZQL query to LogicalPlan: collection of Z's
 	 *   - executes each Z, using appropriate driver instance
+	 * @throws Exception 
 	 */
 	@Override
-	protected Object jobRun() throws ZQLException, ZException, ResultDataException {
+	protected Object jobRun() throws Exception {
 		LinkedList<Result> results = new LinkedList<Result>();
 		ZQL zqlEvaluator = new ZQL(zql, zengine);
 		zqlPlans = zqlEvaluator.compile();
@@ -151,7 +152,7 @@
 				zz.execute();
 				results.add(zz.result());
 				zz.release();
-			} catch (ZException e) {
+			} catch (Exception e) {
 				error = new Result(e);
 				throw e;
 			}
