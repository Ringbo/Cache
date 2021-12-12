diff --git a/modules/core/petra/petra-process/src/test/java/com/liferay/petra/process/local/LocalProcessExecutorTest.java b/modules/core/petra/petra-process/src/test/java/com/liferay/petra/process/local/LocalProcessExecutorTest.java
index e94f397..42608a6 100644
--- a/modules/core/petra/petra-process/src/test/java/com/liferay/petra/process/local/LocalProcessExecutorTest.java
+++ b/modules/core/petra/petra-process/src/test/java/com/liferay/petra/process/local/LocalProcessExecutorTest.java
@@ -1198,10 +1198,11 @@
 			}
 		}
 
-		Assert.fail(
+		Assert.assertFalse(
 			StringBundler.concat(
 				"After waited ", String.valueOf(time), " ",
-				String.valueOf(timeUnit), ". ", message));
+				String.valueOf(timeUnit), ". ", message),
+			supplier.get());
 	}
 
 	private static final String _JPDA_OPTIONS1 =
