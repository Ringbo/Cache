diff --git a/aeron-client/src/main/java/uk/co/real_logic/aeron/logbuffer/TermReader.java b/aeron-client/src/main/java/uk/co/real_logic/aeron/logbuffer/TermReader.java
index d412816..048cad9 100644
--- a/aeron-client/src/main/java/uk/co/real_logic/aeron/logbuffer/TermReader.java
+++ b/aeron-client/src/main/java/uk/co/real_logic/aeron/logbuffer/TermReader.java
@@ -78,9 +78,9 @@
             }
             while (fragmentsRead < fragmentsLimit && offset < capacity);
         }
-        catch (final Exception ex)
+        catch (final Throwable t)
         {
-            errorHandler.onError(ex);
+            errorHandler.onError(t);
         }
 
         return pack(offset, fragmentsRead);
