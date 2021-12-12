diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/WriteFlusher.java b/jetty-io/src/main/java/org/eclipse/jetty/io/WriteFlusher.java
index a2d9c8f..d567f45 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/WriteFlusher.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/WriteFlusher.java
@@ -294,7 +294,7 @@
             else
                 fail(callback);
         }
-        catch (IOException e)
+        catch (Throwable e)
         {
             if (DEBUG)
                 LOG.debug("write exception", e);
@@ -366,7 +366,7 @@
             else
                 fail(callback);
         }
-        catch (IOException e)
+        catch (Throwable e)
         {
             if (DEBUG)
                 LOG.debug("completeWrite exception", e);
