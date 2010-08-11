/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tautua.markdownpapers;

import org.tautua.markdownpapers.generators.HtmlGenerator;
import org.tautua.markdownpapers.grammar.Document;
import org.tautua.markdownpapers.grammar.ParseException;
import org.tautua.markdownpapers.grammar.Parser;

import java.io.Reader;
import java.io.Writer;

/**
 * @author Larry Ruiz. Aug 6, 2010
 */
public class Markdown {
    public void transform(Reader reader, Writer writer) throws ParseException {
        Parser parser = new Parser(reader);
        HtmlGenerator generator = new HtmlGenerator(writer);
        Document document = parser.parse();
        generator.visit(document);
    }
}