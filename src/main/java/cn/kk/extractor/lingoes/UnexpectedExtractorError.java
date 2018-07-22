package cn.kk.extractor.lingoes;

@SuppressWarnings("serial")
public class UnexpectedExtractorError extends RuntimeException {
    UnexpectedExtractorError() {
        super();
    }

    UnexpectedExtractorError(String message) {
        super(message);
    }
}