import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] sequence;

    AsciiCharSequence(byte[] sequence) {
        this.sequence = sequence.clone();
    }

    public int length() {
        return sequence.length;
    }

    public char charAt(int index) {
        return (char) sequence[index];
    }

    public String toString() {
        return new String(sequence);
    }

    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subSequence = new byte[end - start];

        if (end - start >= 0) {
            System.arraycopy(sequence, start, subSequence, 0, end - start);
        }

        return new AsciiCharSequence(subSequence);
    }
}

