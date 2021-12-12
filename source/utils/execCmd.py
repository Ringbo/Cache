import subprocess


def execCmd(command):
    process = subprocess.Popen(
        command, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    out, err = process.communicate()
    output = out.decode()
    return output
