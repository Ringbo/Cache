diff --git a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
index 84ce8b2..73c5e7e 100644
--- a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
+++ b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
@@ -518,7 +518,7 @@
         Thread.sleep(delay * 1000);
         filesPosted++;
       } catch (InterruptedException e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
     }
     return filesPosted;
@@ -610,7 +610,7 @@
       } catch (IOException e) {
         warn("Caught exception when trying to open connection to "+u+": "+e.getMessage());
       } catch (InterruptedException e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
     }
     if(!subStack.isEmpty()) {
@@ -1209,7 +1209,7 @@
       } catch (IOException e) {
         warn("IOException opening URL "+url+": "+e.getMessage());
       } catch (Exception e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
       return l;
     }
