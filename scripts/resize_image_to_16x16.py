"""
This script resizes the given image to 16x16 scale.

It depends on the Pillow (PIL) library for image processing, and argparse library for command-line arguments parsing.
"""

import argparse
from PIL import Image

if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description='Resize image to 16x16 scale.')
    parser.add_argument(
        '--output',
        type=str,
        help=
        'Path to the output image file. If not specified the output file will '
        'be input file itself (i.e. the input file will be overwritten as output.)'
    )
    parser.add_argument('input',
                        type=str,
                        help='Path to the input image file.')
    args = parser.parse_args()

    input_path = args.input
    if args.output:
        output_path = args.output
    else:
        output_path = input_path

    image = Image.open(input_path)
    resized_image = image.resize((16, 16))
    resized_image.save(output_path)
