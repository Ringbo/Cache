diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/repeat/context/SynchronizedAttributeAccessor.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/repeat/context/SynchronizedAttributeAccessor.java
index 97e09ab..03b4cc6 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/repeat/context/SynchronizedAttributeAccessor.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/repeat/context/SynchronizedAttributeAccessor.java
@@ -151,7 +151,7 @@
 	 */
     @Override
 	public String toString() {
-		StringBuffer buffer = new StringBuffer("SynchronizedAttributeAccessor: [");
+		StringBuilder buffer = new StringBuilder("SynchronizedAttributeAccessor: [");
 		synchronized (support) {
 			String[] names = attributeNames();
 			for (int i = 0; i < names.length; i++) {
