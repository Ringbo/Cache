diff --git a/javamelody-core/src/main/java/net/bull/javamelody/RequestToMethodMapper.java b/javamelody-core/src/main/java/net/bull/javamelody/RequestToMethodMapper.java
index 1da5299..6fe6c7b 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/RequestToMethodMapper.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/RequestToMethodMapper.java
@@ -102,7 +102,7 @@
 			} else if (targetException instanceof Error) {
 				throw (Error) targetException;
 			}
-			throw new IOException(e);
+			throw new IOException(targetException);
 		}
 	}
 
