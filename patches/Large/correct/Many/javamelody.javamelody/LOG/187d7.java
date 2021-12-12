diff --git a/javamelody-core/src/main/java/net/bull/javamelody/LOG.java b/javamelody-core/src/main/java/net/bull/javamelody/LOG.java
index 564de5d..bf9ccc9 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/LOG.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/LOG.java
@@ -164,7 +164,9 @@
 			// org.apache.log4j.Logger mais pas org.apache.log4j.AppenderSkeleton
 			Class.forName("org.apache.log4j.AppenderSkeleton");
 			return true;
-		} catch (final ClassNotFoundException e) {
+		} catch (final Throwable e) { // NOPMD
+			// catch Throwable et non catch ClassNotFoundException
+			// pour certaines configurations de JBoss qui inclut Log4J (cf issue 166)
 			return false;
 		}
 	}
