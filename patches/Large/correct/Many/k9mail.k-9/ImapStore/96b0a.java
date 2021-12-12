diff --git a/src/com/fsck/k9/mail/store/ImapStore.java b/src/com/fsck/k9/mail/store/ImapStore.java
index bddbf89..17441a6 100644
--- a/src/com/fsck/k9/mail/store/ImapStore.java
+++ b/src/com/fsck/k9/mail/store/ImapStore.java
@@ -989,7 +989,8 @@
                 return true;
             } catch (IOException ioe) {
                 throw ioExceptionHandler(mConnection, ioe);
-            } catch (MessagingException me) {
+            } catch (ImapException ie) {
+                // We got a response, but it was not "OK"
                 return false;
             }
         }
@@ -1017,7 +1018,8 @@
                                                 encodeString(encodeFolderName(getPrefixedName()))));
                 mExists = true;
                 return true;
-            } catch (MessagingException me) {
+            } catch (ImapException ie) {
+                // We got a response, but it was not "OK"
                 return false;
             } catch (IOException ioe) {
                 throw ioExceptionHandler(connection, ioe);
@@ -1047,7 +1049,8 @@
                 connection.executeSimpleCommand(String.format("CREATE %s",
                                                 encodeString(encodeFolderName(getPrefixedName()))));
                 return true;
-            } catch (MessagingException me) {
+            } catch (ImapException ie) {
+                // We got a response, but it was not "OK"
                 return false;
             } catch (IOException ioe) {
                 throw ioExceptionHandler(mConnection, ioe);
