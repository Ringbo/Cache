diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/genrule/BazelGenRuleRule.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/genrule/BazelGenRuleRule.java
index 193dfb3..182d2d9 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/genrule/BazelGenRuleRule.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/genrule/BazelGenRuleRule.java
@@ -112,14 +112,6 @@
           </li>
           <li>
             <p>
-              Then, if <a href="#genrule.heuristic_label_expansion"><code>heuristic label
-              expansion</code></a> is enabled, a heuristic pass is applied to the string to replace
-              all occurrences of the labels listed in the <code>srcs</code> and <code>tools</code>
-              attributes of the rule, by their corresponding filenames. In effect, this is the same
-              substitution as <code>$(location)</code>, but is done implicitly and is not always
-              accurate.
-            </p>
-            <p>
               Note that <code>outs</code> are <i>not</i> included in this substitution. Output files
               are always generated into a predictable location (available via <code>$(@D)</code>,
               <code>$@</code>, <code>$(OUTS)</code> or <code>$(location <i>output_name</i>)</code>;
@@ -191,29 +183,9 @@
 
         // TODO(bazel-team): stamping doesn't seem to work. Fix it or remove attribute.
         .add(attr("stamp", BOOLEAN).value(false))
-
-        /* <!-- #BLAZE_RULE(genrule).ATTRIBUTE(heuristic_label_expansion) -->
-        Whether to perform heuristic label expansion.
-        ${SYNOPSIS}
-        <p>
-          <em>This attribute is only documented for completeness' sake and because it may be the
-          culprit of surprising errors when it's enabled. We recommend to always disable it.</em>
-        </p>
-        <p>
-          If enabled, Bazel attempts to find labels in the command and expand them, forgiving for
-          missing <code>$(location)</code> function calls. However, enabling this heuristic does not
-          guarantee that Bazel will find all labels, meaning that it doesn't remove the need to use
-          <code>$(location)</code> calls. Even worse, it can lead to surprising behavior when Bazel
-          thinks something is a label which actually isn't. See the
-          <a href="genrule_examples">examples</a> section for an illustration of heuristic label
-          expansion going wrong.
-        </p>
-        <p>
-          When disabled, Bazel only expands labels in <code>$(location)</code> and
-          <code>$(locations)</code> functions. We recommend that you always disable this feature.
-        </p>
-        <!-- #END_BLAZE_RULE.ATTRIBUTE --> */
-        .add(attr("heuristic_label_expansion", BOOLEAN).value(true))
+        // This is a misfeature, so don't document it. We would like to get rid of it, but that
+        // would require a cleanup of existing rules.
+        .add(attr("heuristic_label_expansion", BOOLEAN).value(false))
         .add(attr("$is_executable", BOOLEAN)
             .nonconfigurable("Called from RunCommand.isExecutable, which takes a Target")
             .value(
@@ -385,24 +357,6 @@
     ],
     outs = ["concatenated.txt"],
     cmd = "cat $(locations //some:files) $(location //other:gen) > $@",
-)
-</pre>
-
-<p>
-  The following example shows why enabling
-  <a href="#genrule.heuristic_label_expansion">heuristic label expansion</a> is discouraged.
-</p>
-<pre class="code">
-genrule(
-    name = "foo",
-    srcs = ["a.txt"],
-    outs = ["foo.out"],
-    heuristic_label_expansion = 1,
-    cmd = ("tmp=$$(mktemp -d) ; " +
-           "cd $$tmp ; " +
-           "echo hello &gt; a.txt ; " +  # a.txt will be automatically expanded though it shouldn't!
-           "cd - ; " +
-           "cp $$tmp/a.txt &gt; $@"),
 )
 </pre>
 
