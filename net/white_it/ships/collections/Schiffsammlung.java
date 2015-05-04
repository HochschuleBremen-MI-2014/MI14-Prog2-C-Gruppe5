package net.white_it.ships.collections;

import net.white_it.ships.models.Schiff;

/**
 * @author Florian Tenhaken <admin at white-it dot net>
 */
public class Schiffsammlung {
    private Schiff[] schiffe;

    public Schiffsammlung() {
        this.schiffe = new Schiff[0];
    }

    public Schiff[] getSchiffe() {
        return schiffe;
    }

    public void push(Schiff schiff) {
        Schiff[] s = new Schiff[schiffe.length + 1];
        for (int i = 0; i < schiffe.length; i++) {
            s[i] = this.schiffe[i];
        }
        s[schiffe.length] = schiff;
        this.schiffe = s;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p/>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        String ret = "[Schiffsammlung=";
        int len = this.schiffe.length;

        for(int i = 0; i < len-1;i++){
            ret += this.schiffe[i].toString() + ",";
        }

        if(len > 0)
            ret += this.schiffe[len-1].toString();

        ret += "]";

        return ret;
    }
}