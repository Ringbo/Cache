diff --git a/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/authc/esusers/tool/ESUsersTool.java b/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/authc/esusers/tool/ESUsersTool.java
index 3587b4a..ceb0567 100644
--- a/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/authc/esusers/tool/ESUsersTool.java
+++ b/elasticsearch/x-pack/shield/src/main/java/org/elasticsearch/shield/authc/esusers/tool/ESUsersTool.java
@@ -160,7 +160,7 @@
             Path file = FileUserPasswdStore.resolveFile(esusersSettings, env);
             Map<String, char[]> users = new HashMap<>(FileUserPasswdStore.parseFile(file, null));
             if (users.containsKey(username)) {
-                terminal.println(String.format("User [%s] already exists", username));
+                terminal.println(String.format(Locale.ROOT, "User [%s] already exists", username));
                 return ExitStatus.CODE_ERROR;
             }
             Hasher hasher = Hasher.BCRYPT;
@@ -228,7 +228,7 @@
             Path file = FileUserPasswdStore.resolveFile(esusersSettings, env);
             Map<String, char[]> users = new HashMap<>(FileUserPasswdStore.parseFile(file, null));
             if (!users.containsKey(username)) {
-                terminal.println(String.format("User [%s] doesn't exist", username));
+                terminal.println(String.format(Locale.ROOT, "User [%s] doesn't exist", username));
                 return ExitStatus.NO_USER;
             }
 
@@ -308,7 +308,7 @@
             Path file = FileUserPasswdStore.resolveFile(esusersSettings, env);
             Map<String, char[]> users = new HashMap<>(FileUserPasswdStore.parseFile(file, null));
             if (!users.containsKey(username)) {
-                terminal.println(String.format("User [%s] doesn't exist", username));
+                terminal.println(String.format(Locale.ROOT, "User [%s] doesn't exist", username));
                 return ExitStatus.NO_USER;
             }
             Hasher hasher = Hasher.BCRYPT;
@@ -378,7 +378,7 @@
             String[] allRoles = ArrayUtils.concat(addRoles, removeRoles, String.class);
             for (String role : allRoles) {
                 if (!ROLE_PATTERN.matcher(role).matches()) {
-                    terminal.println(String.format("Role name [%s] is not valid. Please use lowercase and numbers only", role));
+                    terminal.println(String.format(Locale.ROOT, "Role name [%s] is not valid. Please use lowercase and numbers only", role));
                     return ExitStatus.DATA_ERROR;
                 }
             }
@@ -388,7 +388,7 @@
             Path path = FileUserPasswdStore.resolveFile(esusersSettings, env);
             Map<String, char[]> usersMap = FileUserPasswdStore.parseFile(path, null);
             if (!usersMap.containsKey(username)) {
-                terminal.println(String.format("User [%s] doesn't exist", username));
+                terminal.println(String.format(Locale.ROOT, "User [%s] doesn't exist", username));
                 return ExitStatus.NO_USER;
             }
 
@@ -451,7 +451,7 @@
 
             if (username != null) {
                 if (!users.contains(username)) {
-                    terminal.println(String.format("User [%s] doesn't exist", username));
+                    terminal.println(String.format(Locale.ROOT, "User [%s] doesn't exist", username));
                     return ExitStatus.NO_USER;
                 }
 
@@ -459,15 +459,15 @@
                     String[] roles = userRoles.get(username);
                     Set<String> unknownRoles = Sets.difference(Sets.newHashSet(roles), knownRoles);
                     String[] markedRoles = markUnknownRoles(roles, unknownRoles);
-                    terminal.println(String.format("%-15s: %s", username, Arrays.stream(markedRoles).map(s -> s == null ? "-" : s).collect(Collectors.joining(","))));
+                    terminal.println(String.format(Locale.ROOT, "%-15s: %s", username, Arrays.stream(markedRoles).map(s -> s == null ? "-" : s).collect(Collectors.joining(","))));
                     if (!unknownRoles.isEmpty()) {
                         // at least one role is marked... so printing the legend
                         Path rolesFile = FileRolesStore.resolveFile(esusersSettings, env).toAbsolutePath();
                         terminal.println();
-                        terminal.println(String.format(" [*]   An unknown role. Please check [%s] to see available roles", rolesFile.toAbsolutePath()));
+                        terminal.println(String.format(Locale.ROOT, " [*]   An unknown role. Please check [%s] to see available roles", rolesFile.toAbsolutePath()));
                     }
                 } else {
-                    terminal.println(String.format("%-15s: -", username));
+                    terminal.println(String.format(Locale.ROOT, "%-15s: -", username));
                 }
             } else {
                 boolean unknownRolesFound = false;
@@ -476,7 +476,7 @@
                     String[] roles = entry.getValue();
                     Set<String> unknownRoles = Sets.difference(Sets.newHashSet(roles), knownRoles);
                     String[] markedRoles = markUnknownRoles(roles, unknownRoles);
-                    terminal.println(String.format("%-15s: %s", entry.getKey(), String.join(",", markedRoles)));
+                    terminal.println(String.format(Locale.ROOT, "%-15s: %s", entry.getKey(), String.join(",", markedRoles)));
                     unknownRolesFound = unknownRolesFound || !unknownRoles.isEmpty();
                     usersExist = true;
                 }
@@ -484,7 +484,7 @@
                 Set<String> usersWithoutRoles = Sets.newHashSet(users);
                 usersWithoutRoles.removeAll(userRoles.keySet());
                 for (String user : usersWithoutRoles) {
-                    terminal.println(String.format("%-15s: -", user));
+                    terminal.println(String.format(Locale.ROOT, "%-15s: -", user));
                     usersExist = true;
                 }
 
@@ -497,7 +497,7 @@
                     // at least one role is marked... so printing the legend
                     Path rolesFile = FileRolesStore.resolveFile(esusersSettings, env).toAbsolutePath();
                     terminal.println();
-                    terminal.println(String.format(" [*]   An unknown role. Please check [%s] to see available roles", rolesFile.toAbsolutePath()));
+                    terminal.println(String.format(Locale.ROOT, " [*]   An unknown role. Please check [%s] to see available roles", rolesFile.toAbsolutePath()));
                 }
             }
 
@@ -511,7 +511,7 @@
             return FileRolesStore.parseFileForRoleNames(rolesFile, null);
         } catch (Throwable t) {
             // if for some reason, parsing fails (malformatted perhaps) we just warn
-            terminal.println(String.format("Warning:  Could not parse [%s] for roles verification. Please revise and fix it. Nonetheless, the user will still be associated with all specified roles", rolesFile.toAbsolutePath()));
+            terminal.println(String.format(Locale.ROOT, "Warning:  Could not parse [%s] for roles verification. Please revise and fix it. Nonetheless, the user will still be associated with all specified roles", rolesFile.toAbsolutePath()));
         }
         return null;
     }
@@ -536,7 +536,7 @@
         Set<String> unknownRoles = Sets.difference(Sets.newHashSet(roles), knownRoles);
         if (!unknownRoles.isEmpty()) {
             Path rolesFile = FileRolesStore.resolveFile(settings, env);
-            terminal.println(String.format("Warning: The following roles [%s] are unknown. Make sure to add them to the [%s] file. " +
+            terminal.println(String.format(Locale.ROOT, "Warning: The following roles [%s] are unknown. Make sure to add them to the [%s] file. " +
                     "Nonetheless the user will still be associated with all specified roles",
                 Strings.collectionToCommaDelimitedString(unknownRoles), rolesFile.toAbsolutePath()));
         }
