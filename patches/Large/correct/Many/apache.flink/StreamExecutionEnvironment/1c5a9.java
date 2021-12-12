diff --git a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamExecutionEnvironment.java b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamExecutionEnvironment.java
index 83ca4a6..f35434f 100644
--- a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamExecutionEnvironment.java
+++ b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamExecutionEnvironment.java
@@ -711,7 +711,7 @@
 		catch (Exception e) {
 			throw new RuntimeException("Could not create TypeInformation for type " + data[0].getClass().getName()
 					+ "; please specify the TypeInformation manually via "
-					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)");
+					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)", e);
 		}
 		return fromCollection(Arrays.asList(data), typeInfo);
 	}
@@ -744,7 +744,7 @@
 		catch (Exception e) {
 			throw new RuntimeException("Could not create TypeInformation for type " + type.getName()
 					+ "; please specify the TypeInformation manually via "
-					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)");
+					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)", e);
 		}
 		return fromCollection(Arrays.asList(data), typeInfo);
 	}
@@ -785,7 +785,7 @@
 		catch (Exception e) {
 			throw new RuntimeException("Could not create TypeInformation for type " + first.getClass()
 					+ "; please specify the TypeInformation manually via "
-					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)");
+					+ "StreamExecutionEnvironment#fromElements(Collection, TypeInformation)", e);
 		}
 		return fromCollection(data, typeInfo);
 	}
