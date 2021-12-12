diff --git a/flink-java/src/main/java/org/apache/flink/api/java/ExecutionEnvironment.java b/flink-java/src/main/java/org/apache/flink/api/java/ExecutionEnvironment.java
index 5a5bddb..8206220 100644
--- a/flink-java/src/main/java/org/apache/flink/api/java/ExecutionEnvironment.java
+++ b/flink-java/src/main/java/org/apache/flink/api/java/ExecutionEnvironment.java
@@ -703,7 +703,7 @@
 		catch (Exception e) {
 			throw new RuntimeException("Could not create TypeInformation for type " + data[0].getClass().getName()
 					+ "; please specify the TypeInformation manually via "
-					+ "ExecutionEnvironment#fromElements(Collection, TypeInformation)");
+					+ "ExecutionEnvironment#fromElements(Collection, TypeInformation)", e);
 		}
 
 		return fromCollection(Arrays.asList(data), typeInfo, Utils.getCallLocationName());
@@ -736,7 +736,7 @@
 		catch (Exception e) {
 			throw new RuntimeException("Could not create TypeInformation for type " + type.getName()
 					+ "; please specify the TypeInformation manually via "
-					+ "ExecutionEnvironment#fromElements(Collection, TypeInformation)");
+					+ "ExecutionEnvironment#fromElements(Collection, TypeInformation)", e);
 		}
 
 		return fromCollection(Arrays.asList(data), typeInfo, Utils.getCallLocationName());
