package org.prismlauncher.javacheck;

public final class JavaCheck {

    public static void main(final String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: <properties...>");
            System.exit(1);
        }

        boolean missingSome = false;

        for (final String property : args) {
            String propertyValue = System.getProperty(property);

            if (propertyValue == null) {
                missingSome = true;
                continue;
            }

            System.out.println(property + '=' + propertyValue);
        }

        if (missingSome)
            System.exit(1);
    }

}