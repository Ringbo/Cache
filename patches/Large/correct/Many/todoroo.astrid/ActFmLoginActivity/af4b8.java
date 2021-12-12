diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java b/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
index 3ecca1d..71e5423 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
@@ -882,7 +882,7 @@
                             message = getString(R.string.actfm_ALA_error_user_exists);
                         else if ("incorrect_password".equals(code))
                             message = getString(R.string.actfm_ALA_error_wrong_password);
-                        else if ("user_not_found".equals(code))
+                        else if ("user_not_found".equals(code) || "missing_param".equals(code))
                             message = getString(R.string.actfm_ALA_error_user_not_found);
                     }
                 }
