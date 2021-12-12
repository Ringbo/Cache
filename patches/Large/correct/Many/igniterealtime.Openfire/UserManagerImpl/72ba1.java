diff --git a/src/java/org/jivesoftware/messenger/user/spi/UserManagerImpl.java b/src/java/org/jivesoftware/messenger/user/spi/UserManagerImpl.java
index 171dc0b..f6a228d 100644
--- a/src/java/org/jivesoftware/messenger/user/spi/UserManagerImpl.java
+++ b/src/java/org/jivesoftware/messenger/user/spi/UserManagerImpl.java
@@ -240,7 +240,7 @@
             try { if (con != null) { con.close(); } }
             catch (Exception e) { Log.error(e); }
         }
-        return new UserIterator((String [])users.toArray());
+        return new UserIterator((String [])users.toArray(new String[users.size()]));
     }
 
     public Iterator users(int startIndex, int numResults) throws UnauthorizedException {
@@ -276,7 +276,7 @@
             try { if (con != null) { con.close(); } }
             catch (Exception e) { Log.error(e); }
         }
-        return new UserIterator((String [])users.toArray());
+        return new UserIterator((String [])users.toArray(new String[users.size()]));
     }
 
     // #####################################################################
