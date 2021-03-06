package uk.co.todddavies.bnccompressor.bnc;

import java.io.Closeable;
import java.util.Iterator;

import com.google.common.collect.ImmutableList;

import uk.co.todddavies.bnccompressor.TokenTag;

public interface BncIterator extends Iterator<ImmutableList<TokenTag>>, Closeable {}
